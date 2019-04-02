package net.genieworks.ginterface.batch.schedule.reader;


import lombok.extern.slf4j.Slf4j;
import net.genieworks.ginterface.batch.model.domain.Product;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class Cafe24ProductCollector implements ItemReader<List<Product>> {

    @Override
    public List<Product> read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return null;
    }
}
