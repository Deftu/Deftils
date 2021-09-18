package xyz.qalcyo.mango;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListsTests {

    @Test
    @DisplayName("Lists test")
    public void lists() {
        List<String> list = new ArrayList<>();
        list.add("gaming");
        list.add("a");
        list.add("saui");
        System.out.println(list);
        Lists.sortByStringReversed(list);
        System.out.println(list);
    }

}