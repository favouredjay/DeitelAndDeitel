package chapterFour;

import org.junit.jupiter.api.Test;

public class EnforcingPrivacyWithCryptographyTest {
    EnforcingPrivacyWithCryptography cryptography = new EnforcingPrivacyWithCryptography();

    @Test
    void testThatDigitsCanBeEncrypted(){
        cryptography.encryption(5521);
        System.out.println(cryptography.getEncryption());
    }
}
