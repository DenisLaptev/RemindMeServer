package ua.a5.remindme.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.a5.remindme.server.entity.Remind;
import ua.a5.remindme.server.repository.RemindRepository;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService {
    //Сюда подключаем репозитории.
    //Здесь выполняем всю бизнес-логику приложения.
    //Контроллеры(Сервлеты) вызывают сервисы.


    @Autowired
    private RemindRepository repository;

    public List<Remind> getAll() {
        return repository.findAll();
    }

    public Remind getByID(long id) {
        return repository.findOne(id);
    }

    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
