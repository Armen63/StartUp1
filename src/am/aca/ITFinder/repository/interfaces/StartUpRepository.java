package am.aca.ITFinder.repository.interfaces;

import am.aca.ITFinder.comman.exception.MyException;
import am.aca.ITFinder.comman.model.StartUp;

import java.sql.SQLException;

/**
 * Created by Armen on 10/21/2016.
 */
public interface StartUpRepository {
    void addStartUp(StartUp job)throws MyException, SQLException;
    void editStartUp(Integer id) throws SQLException , SQLException;
    void deleteStartUp(Integer id) throws MyException, SQLException;
    void getStartUp(Integer id) throws MyException, SQLException;
}
