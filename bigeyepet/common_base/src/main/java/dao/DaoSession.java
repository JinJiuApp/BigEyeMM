package dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig adModelDaoConfig;
    private final DaoConfig bankItemDaoConfig;
    private final DaoConfig searchHistoryItemDaoConfig;
    private final DaoConfig bottomBarItemDaoConfig;
    private final DaoConfig cityItemDaoConfig;
    private final DaoConfig businessItemDaoConfig;

    private final AdModelDao adModelDao;
    private final BankItemDao bankItemDao;
    private final SearchHistoryItemDao searchHistoryItemDao;
    private final BottomBarItemDao bottomBarItemDao;
    private final CityItemDao cityItemDao;
    private final BusinessItemDao businessItemDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        adModelDaoConfig = daoConfigMap.get(AdModelDao.class).clone();
        adModelDaoConfig.initIdentityScope(type);

        bankItemDaoConfig = daoConfigMap.get(BankItemDao.class).clone();
        bankItemDaoConfig.initIdentityScope(type);

        searchHistoryItemDaoConfig = daoConfigMap.get(SearchHistoryItemDao.class).clone();
        searchHistoryItemDaoConfig.initIdentityScope(type);

        bottomBarItemDaoConfig = daoConfigMap.get(BottomBarItemDao.class).clone();
        bottomBarItemDaoConfig.initIdentityScope(type);

        cityItemDaoConfig = daoConfigMap.get(CityItemDao.class).clone();
        cityItemDaoConfig.initIdentityScope(type);

        businessItemDaoConfig = daoConfigMap.get(BusinessItemDao.class).clone();
        businessItemDaoConfig.initIdentityScope(type);

        adModelDao = new AdModelDao(adModelDaoConfig, this);
        bankItemDao = new BankItemDao(bankItemDaoConfig, this);
        searchHistoryItemDao = new SearchHistoryItemDao(searchHistoryItemDaoConfig, this);
        bottomBarItemDao = new BottomBarItemDao(bottomBarItemDaoConfig, this);
        cityItemDao = new CityItemDao(cityItemDaoConfig, this);
        businessItemDao = new BusinessItemDao(businessItemDaoConfig, this);

        registerDao(AdModel.class, adModelDao);
        registerDao(BankItem.class, bankItemDao);
        registerDao(SearchHistoryItem.class, searchHistoryItemDao);
        registerDao(BottomBarItem.class, bottomBarItemDao);
        registerDao(CityItem.class, cityItemDao);
        registerDao(BusinessItem.class, businessItemDao);
    }
    
    public void clear() {
        adModelDaoConfig.getIdentityScope().clear();
        bankItemDaoConfig.getIdentityScope().clear();
        searchHistoryItemDaoConfig.getIdentityScope().clear();
        bottomBarItemDaoConfig.getIdentityScope().clear();
        cityItemDaoConfig.getIdentityScope().clear();
        businessItemDaoConfig.getIdentityScope().clear();
    }

    public AdModelDao getAdModelDao() {
        return adModelDao;
    }

    public BankItemDao getBankItemDao() {
        return bankItemDao;
    }

    public SearchHistoryItemDao getSearchHistoryItemDao() {
        return searchHistoryItemDao;
    }

    public BottomBarItemDao getBottomBarItemDao() {
        return bottomBarItemDao;
    }

    public CityItemDao getCityItemDao() {
        return cityItemDao;
    }

    public BusinessItemDao getBusinessItemDao() {
        return businessItemDao;
    }

}