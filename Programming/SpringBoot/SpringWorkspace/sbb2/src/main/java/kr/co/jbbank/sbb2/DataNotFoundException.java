package kr.co.jbbank.sbb2;

import org.springframework.web.bind.annotation.ResponseStatus;
<<<<<<< HEAD

// @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found")
// public class DataNotFoundException extends RuntimeException {
//     private static final long serialVersionUID = 1L;
//     public DataNotFoundException(String message) {
//         super(message);
//     }
// }
=======
import org.springframework.http.HttpStatus;
>>>>>>> 94236820fffdacbdcfb40df4cfe88c8d718dab57

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found")
public class DataNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public DataNotFoundException(String message) {
        super(message);
    }
<<<<<<< HEAD
}

// import org.springframework.http.HttpStatus;
// import org.springframework.web.bind.annotation.ResponseStatus;

// @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found")
// public class DataNotFoundException extends RuntimeException {
//     private static final long serialVersionUID = 1L;
//     public DataNotFoundException(String message) {
//         super(message);
//     }
// }
=======
    
}
>>>>>>> 94236820fffdacbdcfb40df4cfe88c8d718dab57
