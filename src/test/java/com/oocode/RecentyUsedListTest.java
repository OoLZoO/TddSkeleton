package com.oocode;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RecentyUsedListTest {
	@Test 
	public void InitialisedEmptyListTest()
	{
		RecentyUsedList recentyUsedList = new RecentyUsedList();
		assertThat(recentyUsedList.getRecentyUsedList().size(), is(0));
	}

	@Test
	public void AddItemToListTest()
	{
		RecentyUsedList recentyUsedList = new RecentyUsedList();
		recentyUsedList.addItemToList("Item1");
		assertThat(recentyUsedList.getRecentyUsedList().size(), is(1));
		assertThat(recentyUsedList.getRecentyUsedList().get(0), is("Item1"));
	}

	@Test
	public void GetItemFromListTest()
	{
		RecentyUsedList recentyUsedList = new RecentyUsedList();
		recentyUsedList.addItemToList("Item1");
		recentyUsedList.addItemToList("Item2");
		recentyUsedList.addItemToList("Item3");
		assertThat(recentyUsedList.getRecentyUsedList().size(), is(3));
		assertThat(recentyUsedList.getRecentyUsedList().get(0), is("Item3"));
		assertThat(recentyUsedList.getRecentyUsedList().get(1), is("Item2"));
		assertThat(recentyUsedList.getRecentyUsedList().get(2), is("Item1"));
	}

	@Test
	public void DoNotAddDuplicateItemToListTest()
	{
		RecentyUsedList recentyUsedList = new RecentyUsedList();
		recentyUsedList.addItemToList("Item1");
		recentyUsedList.addItemToList("Item2");
		recentyUsedList.addItemToList("Item3");
		recentyUsedList.addItemToList("Item2");
		assertThat(recentyUsedList.getRecentyUsedList().size(), is(3));
		assertThat(recentyUsedList.getRecentyUsedList().get(0), is("Item3"));
		assertThat(recentyUsedList.getRecentyUsedList().get(1), is("Item2"));
		assertThat(recentyUsedList.getRecentyUsedList().get(2), is("Item1"));
	}

	@Test
	public void RecentItemTopOfTheListTest()
	{
		RecentyUsedList recentyUsedList = new RecentyUsedList();
		recentyUsedList.addItemToList("Item1");
		recentyUsedList.addItemToList("Item2");
		assertThat(recentyUsedList.getRecentyUsedList().get(0), is("Item2"));
	}

	@Test
	public void AddIntegerToTheListTest()
	{
		RecentyUsedList recentyUsedList = new RecentyUsedList();
		recentyUsedList.addItemToList(123);
		assertThat(recentyUsedList.getRecentyUsedList().get(0), is("123"));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void TestExceptionWhenListElementOutOfBound() {
		RecentyUsedList recentyUsedList = new RecentyUsedList();
		recentyUsedList.addItemToList("Item1");
		recentyUsedList.getRecentyUsedList().get(1);
	}

	@Ignore("Cannot create null ref exception")
	@Test(expected = NullPointerException.class)
	public void TestNullReferenceExceptionWhenNotInitialized() {
		RecentyUsedList recentyUsedList = new RecentyUsedList();
		recentyUsedList.addItemToList("Item1");
	}

}
