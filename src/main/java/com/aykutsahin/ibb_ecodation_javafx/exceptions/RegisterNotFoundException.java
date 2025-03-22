package com.aykutsahin.ibb_ecodation_javafx.exceptions;

// Kayıt bulunamazsa Fırlatılacak Özel Excepiton
public class RegisterNotFoundException extends RuntimeException {

    // Parametresiz Constructor
    public RegisterNotFoundException() {
        super("Kayıt bulunamadı");
    }

    // Parametreli Constructor
    public RegisterNotFoundException(String message) {
        super(message);
    }
}