package nl.jpoint.compose.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JdbcTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void name() {
        final Integer result = jdbcTemplate.queryForObject("select 1", Integer.class);
        assertEquals(1, result);
    }

}
