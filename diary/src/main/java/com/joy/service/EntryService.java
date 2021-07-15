package com.joy.service;

import com.joy.diary.Entry;
import com.joy.exception.EntryException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EntryService {
    Entry createEntry(Entry entry);
    List<Entry>getAllEntries();
    void deleteEntry(String id) throws EntryException;
    Entry updateEntry(String id, Entry entry) throws EntryException;

}
