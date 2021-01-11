package it.begear.rpgworld;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import it.begear.rpgworld.entity.Personaggio;
import it.begear.rpgworld.repository.PersonaggioRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class RpgTest {

    @Autowired
    private PersonaggioRepository pr;

    @Test
    void saveTest() {
        Personaggio personaggio = new Personaggio();
        Personaggio salvato = pr.save(personaggio);
        assertNotNull(salvato);
    }

    @Test
    void testGet() {
        Personaggio personaggio = pr.getOne(38);
        Personaggio idpersonaggio = pr.getOne(personaggio.getIdpersonaggio());
        assertEquals(personaggio.getNome(), idpersonaggio.getNome());

    }

    @Test
    void testDelete() {
        Integer id = 38;
        boolean isExistsBeforeDelete = pr.findById(id).isPresent();
        pr.deleteById(id);
        boolean isExistsAfterDelete = pr.findById(id).isPresent();
        assertTrue(isExistsBeforeDelete);
        assertFalse(isExistsAfterDelete);
    }

    @Test
    void testLista() {
        List<Personaggio> listaAttuale = pr.findAll();
        List<Personaggio> listaAttesa = pr.findAll();
        assertEquals(listaAttuale, listaAttesa);
    }


}
