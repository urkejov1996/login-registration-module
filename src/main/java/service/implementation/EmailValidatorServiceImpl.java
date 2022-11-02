package service.implementation;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
@Service
public class EmailValidatorServiceImpl implements Predicate<String> {
    @Override
    public boolean test(String s) {

//        TODO: Validate email

        return false;
    }
}
