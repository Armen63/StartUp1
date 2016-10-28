package am.aca.ITFinder.repository.implementation;

import am.aca.ITFinder.comman.exception.MyException;
import am.aca.ITFinder.comman.model.StartUp;
import am.aca.ITFinder.repository.interfaces.StartUpRepository;

import java.sql.SQLException;

/**
 * Created by Armen on 10/21/2016.
 */
public class StartUpRepositoryImpl implements StartUpRepository {

    private static StartUpRepositoryImpl instance;

    public static StartUpRepositoryImpl getInstance(){
        if(instance==null){
            instance=new StartUpRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void addStartUp(StartUp job) throws MyException, SQLException {

    }

    @Override
    public void editStartUp(Integer id) throws SQLException, SQLException {

    }

    @Override
    public void deleteStartUp(Integer id) throws MyException, SQLException {

    }

    @Override
    public void getStartUp(Integer id) throws MyException, SQLException {

    }
}
