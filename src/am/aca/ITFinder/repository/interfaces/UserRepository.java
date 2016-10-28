package am.aca.ITFinder.repository.interfaces;

import am.aca.ITFinder.comman.exception.MyException;
import am.aca.ITFinder.comman.model.User;

import java.sql.SQLException;

/**
 * Created by Armen on 10/18/2016.
 */
public interface UserRepository {
    void addUser(User user) throws MyException, SQLException;
    void editUser(Integer id) throws MyException, SQLException, MyException;
    void deleteUser(Integer id) throws MyException, SQLException;
    void getUser(Integer id) throws MyException, SQLException;
}
