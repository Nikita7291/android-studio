package ru.gibdd.practiceexam

object ExerciseRepository {

    fun getExercises(): List<Exercise> = listOf(
        Exercise(
            id = 1,
            title = "Остановка и начало движения",
            description = "Порядок действий перед началом движения: зеркала, поворотник, проверка слепых зон."
        ),
        Exercise(
            id = 2,
            title = "Параллельная парковка",
            description = "Пошаговый разбор заезда в карман задним ходом и типичные ошибки."
        ),
        Exercise(
            id = 3,
            title = "Заезд в бокс",
            description = "Отработка заезда в бокс задним ходом с контролем габаритов."
        ),
        Exercise(
            id = 4,
            title = "Разворот в ограниченном пространстве",
            description = "Разворот с использованием прилегающей территории и без неё."
        ),
        Exercise(
            id = 5,
            title = "Эстакада",
            description = "Остановка и начало движения на подъёме, работа со сцеплением и ручником."
        )
    )
}