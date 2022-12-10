package com.example.homeworktwocoursethree.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String appRun() {
        return "Приложение запущено!";
    }
    @GetMapping("/info")
    public String info() {
        return "Имя ученика: Линар Даминов, название проекта: HomeWorkTwoCourseThree, дата создания: 10.12.2022 " +
                "описание проекта: Домашняя работа номер два, курса три!";
    }
}
