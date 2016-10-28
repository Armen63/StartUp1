package am.aca.ITFinder.repository.interfaces;

import am.aca.ITFinder.comman.exception.MyException;
import am.aca.ITFinder.comman.model.Job;
import am.aca.ITFinder.comman.model.User;

import java.sql.SQLException;

/**
 * Created by Armen on 10/18/2016.
 */
public interface JobRepository {
    void addJob(Job job)throws MyException, SQLException;
    void editJob(Integer id) throws SQLException, MyException;
    void deleteJob(Integer id) throws MyException, SQLException;
    void getJob(Integer id) throws MyException, SQLException;
}
