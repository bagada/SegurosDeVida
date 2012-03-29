package com.qualityOfLife.seguroDeVida.integration.dao.impl;

import java.sql.SQLException;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.qualityOfLife.seguroDeVida.integration.dao.UserPasswordDAO;
import com.qualityOfLife.seguroDeVida.integration.entity.User;
import com.qualityOfLife.seguroDeVida.integration.entity.UserPassword;

public class UserPasswordDAOImpl extends HibernateDaoSupport implements
		UserPasswordDAO {

	public UserPassword findByUserAndPasword(final String username,
			final String password) {
		UserPassword userPassword = (UserPassword) getHibernateTemplate()
				.execute(new HibernateCallback<UserPassword>() {

					public UserPassword doInHibernate(Session session)
							throws HibernateException, SQLException {
						Criteria c = session.createCriteria(User.class);
						c.add(Restrictions.eq("username", username));
						c.add(Restrictions.eq("password", password));
						return (UserPassword) c.uniqueResult();
					}
				});
		return userPassword;
	}

	public void saveUserPassword(UserPassword userPassword) {
		getHibernateTemplate().save(userPassword);

	}

}
