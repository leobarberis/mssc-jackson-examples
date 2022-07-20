package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("kekab")
@JsonTest
public class BeerDtoKekabTest extends BaseTest {

    @Autowired
    ObjectMapper mapper;

    @Test
    void testKekab() throws JsonProcessingException {
        BeerDto dto = getDto();
        String s = mapper.writeValueAsString(dto);
        assertThat(s).isNotEmpty();
    }
}
