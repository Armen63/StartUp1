package am.aca.ITFinder.repository.implementation;

import am.aca.ITFinder.comman.exception.MyException;
import am.aca.ITFinder.comman.model.Job;
import am.aca.ITFinder.repository.interfaces.JobRepository;

import java.sql.SQLException;

/**
 * Created by Armen on 10/18/2016.
 */
public class JobRepositoryImpl implements JobRepository {
    private static JobRepositoryImpl instance;

    public static JobRepositoryImpl getInstance(){
        if(instance==null){
            instance=new JobRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void addJob(Job job) throws MyException, SQLException {

    }

    @Override
    public void editJob(Integer id) throws SQLException, MyException {

    }

    @Override
    public void deleteJob(Integer id) throws MyException, SQLException {

    }

    @Override
    public void getJob(Integer id) throws MyException, SQLException {

    }
}
