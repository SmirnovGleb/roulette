package by.epam.roulette.command.impl;

import javax.servlet.http.HttpServletRequest;

import by.epam.roulette.command.ICommand;
import by.epam.roulette.controller.PathType;
import by.epam.roulette.controller.TypeAction;
import by.epam.roulette.entity.User;

/**
 * The Class PersonalAccountCommand.
 */
public class PersonalAccountCommand implements ICommand {
	private static final String PATH_TO_PERSONAL_ACCOUNT = "jsp/account.jsp";
	private static final String PATH_TO_LOGIN = "jsp/login.jsp";
	private static final String USER_PARAMETER = "user";

	/**
	 * Signing in to user's private cabinet
	 * 
	 * @param request
	 */
	@Override
	public PathType execute(HttpServletRequest request) {
		String currentPath = PATH_TO_LOGIN;
		User user = (User) request.getSession().getAttribute(USER_PARAMETER);
		if (user != null) {
			currentPath = PATH_TO_PERSONAL_ACCOUNT;
		}
		return new PathType(currentPath, TypeAction.FORWARD);
	}

}
