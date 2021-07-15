package com.joy.service;

import com.joy.diary.Entry;
import com.joy.exception.EntryException;
import com.joy.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryServiceImpl implements EntryService {

    @Autowired
    EntryRepository entryRepository;

    @Override
    public Entry createEntry(Entry entry) {
      Entry newEntry = entryRepository.save(entry);
              return newEntry;
    }

    @Override
    public List<Entry> getAllEntries() {
      List<Entry>entries = entryRepository.findAll();
      return entries;

    }

    @Override
    public void deleteEntry(String id) throws EntryException {
        Entry entry = entryRepository.findById(id).orElseThrow(()->new EntryException("No entry found with that id"));

    }

    @Override
    public Entry updateEntry(String id, Entry newEntryDetails) throws EntryException {
       Entry entry = entryRepository.findById(id).orElseThrow(()->new EntryException("No entry found with that id"));
       String newTitle = newEntryDetails.getTitle();
       String newBody = newEntryDetails.getBody();
       if(!newTitle.equals(entry.getTitle()) && !newTitle.equals("")){
           entry.setTitle(newTitle);
       }
       if(!newBody.equals(entry.getBody())){
           entry.setBody(newBody);
       }
       Entry updatedEntry = entryRepository.save(entry);
       return updatedEntry;
    }
}
