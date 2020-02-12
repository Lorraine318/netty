package com.lg.thrift;

import com.lg.thrift.generated.DataException;
import com.lg.thrift.generated.Person;
import com.lg.thrift.generated.PersonService;
import org.apache.thrift.TException;

/**
 * @author liugou  2020/2/12 14:44
 * @version 1.0
 */
//PersonService.Iface   .iface表示实现的接口
public class PersonServiceImpl implements PersonService.Iface {
    @Override
    public Person getPersonByUsername(String username) throws DataException, TException {
        System.out.println("got client param "  + username);

        Person person = new Person();
        person.setAge(2);
        person.setUsername("zhangsan");
        person.setMarried(true);
        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {
        System.out.println(person.getAge());
        System.out.println(person.getUsername());
        System.out.println(person.isMarried());
    }
}
