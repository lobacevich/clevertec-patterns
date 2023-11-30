package by.clevertec.lobacevich.cache.impl;

import by.clevertec.lobacevich.entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LFUCacheTest {

    LFUCache cache = new LFUCache();

    @Test
    void getById() {
        User expected = CasheTestData.getUser1();
        cache.put(expected);

        User actual = cache.getById(1L);

        assertEquals(expected, actual);
    }

    @Test
    void put() {
        cache.put(CasheTestData.getUser1());
        cache.put(CasheTestData.getUser2());
        cache.put(CasheTestData.getUser3());
        cache.put(CasheTestData.getUser4());

        assertNull(cache.getById(1L));
    }

    @Test
    void delete() {
        User user = CasheTestData.getUser1();
        cache.put(user);

        cache.deleteById(1L);

        assertNull(cache.getById(1L));
    }
}