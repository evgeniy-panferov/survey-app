Есть некоторые endpoint-ы:

<hr>  По вопросам для админа:<hr>  
http://localhost:8080/admin/question/save - позволяет сохранить новый вопрос, post запрос - принимает json вида -
 
    {
        "textQuestion": "Как не звать?",
        "questionTypeId": 0,
        "userId": 2,
        "survey":{
            "id": 2
        }
      }
      
host/admin/question/update позволяет обновить вопрос, put запрос - принимает json вида -

      {
        "textQuestion": "Как не звать?",
        "questionTypeId": 0,
        "userId": 2,
        "survey":{
            "id": 2
        }
      }

host/admin/question/delete/{id} - удаляет вопрос, в строке браузера необходимо передать требуемый id для удаления - delete запрос

По опросам для админа:

  http://localhost:8080/admin/survey/save/ - позволяет сохранить опрос, post запрос - принимает json такого вида

    {
    "name": "Опрос ",
    "dateStart": "2021-05-01T10:10",
    "dateFinish": "2021-05-05T10:10",
    "description": "опрос"
    }
  
  http://localhost:8080/admin/survey/update/ - позволяет сохранить опрос,put - запрос принимает json такого вида, 
  
    {
        "id":0,
        "name": "Опрос обновленный",
        "dateStart": "2021-05-05T10:10", - т.к тут обновляется дата, прилетит сообщение "Date start must not be update"
        "dateFinish": "2021-12-05T10:10",
        "description": "Опрос обновленный"
      }
  
   http://localhost:8080/admin/survey/delete/{id} - удаляет опрос, в строке браузера необходимо передать требуемый id для удаления - delete запрос
  
  
<hr>Для пользователей<hr>  
  
 http://localhost:8080/user/surveys - просто получаем список всех доступных опросов, get запрос
 
 
 http://localhost:8080/user/answer - позволяет сохранить ответ пользователя, post запрос - принимает json - 
 
    {
        "text":"Я ответил на вопрос",
        "userId": 5,
        "questionId": 3 - тут указывается id вопроса, на который ответил пользователь, его можно получить от клиента при прохождении определенного вопроса
    }
    
 http://localhost:8080/user/answer/{id} - позволяет получить все ответы на вопросы пользователя по id, 
 id - нужно указать в строке браузера, get запрос
 
 
 
 Используется Basic авторизация логин: admin, пароль: admin. 
 
  Варианты запуска:
  1) Из среды разработки
  2) в консоли перейти в survey-app/docker/ запустить docker-compose.yaml - командой docker-compose -f docker-compose.yaml up