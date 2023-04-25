package com.oocode;

import java.util.ArrayList;
import java.util.List;

public class RecentyUsedList
{
	private List<String> recentyUsedList = new ArrayList<String>();

	public List<String> getRecentyUsedList()
	{
		return recentyUsedList;
	}

	public void addItemToList(String item)
	{
		if(!recentyUsedList.contains(item))
		{
			recentyUsedList.add(0, item);
		}
	}

	public void addItemToList(Integer item)
	{
		addItemToList(String.valueOf(item));
	}

}
