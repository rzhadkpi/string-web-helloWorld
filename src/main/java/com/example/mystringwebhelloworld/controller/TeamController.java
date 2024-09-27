package com.example.mystringwebhelloworld.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/team")
public class TeamController {
    @GetMapping
    @ResponseBody
    public String team() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Bebra Team</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f4f4f4;\n" +
                "            margin: 0;\n" +
                "            padding: 20px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        h1 {\n" +
                "            color: #2c3e50;\n" +
                "        }\n" +
                "        h2 {\n" +
                "            color: #16a085;\n" +
                "        }\n" +
                "        a {\n" +
                "            display: inline-block;\n" +
                "            margin: 10px;\n" +
                "            padding: 10px 20px;\n" +
                "            text-decoration: none;\n" +
                "            color: #fff;\n" +
                "            background-color: #3498db;\n" +
                "            border-radius: 5px;\n" +
                "            transition: background-color 0.3s ease;\n" +
                "        }\n" +
                "        a:hover {\n" +
                "            background-color: #2980b9;\n" +
                "        }\n" +
                "        .container {\n" +
                "            max-width: 800px;\n" +
                "            margin: 0 auto;\n" +
                "            background: #fff;\n" +
                "            padding: 20px;\n" +
                "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <h1>Bebra Team</h1>\n" +
                "        <h2>Землекопи</h2>\n" +
                "        <a href=\"/team/Ruslan\">Ruslan</a><br>\n" +
                "        <a href=\"/team/Mykola\">Mykola</a><br>\n" +
                "        <a href=\"/team/Dmytro\">Dmytro</a><br>\n" +
                "        <a href=\"/team/Valerii\">Valerii</a><br>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
    }

    @GetMapping("/Ruslan")
    @ResponseBody
    public String Ruslan() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Team Member - Ruslan</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f4f4f4;\n" +
                "            margin: 0;\n" +
                "            padding: 20px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        h1 {\n" +
                "            color: #2c3e50;\n" +
                "        }\n" +
                "        .container {\n" +
                "            max-width: 600px;\n" +
                "            margin: 20px auto;\n" +
                "            background: #fff;\n" +
                "            padding: 20px;\n" +
                "            border-radius: 8px;\n" +
                "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
                "            text-align: left;\n" +
                "        }\n" +
                "        label {\n" +
                "            display: block;\n" +
                "            margin: 10px 0 5px;\n" +
                "            font-weight: bold;\n" +
                "        }\n" +
                "        .info-block {\n" +
                "            margin-bottom: 15px;\n" +
                "            padding: 10px;\n" +
                "            border: 1px solid #ddd;\n" +
                "            border-radius: 5px;\n" +
                "            background: #f9f9f9;\n" +
                "        }\n" +
                "        .button-container {\n" +
                "            text-align: center;\n" +
                "            margin-top: 20px;\n" +
                "        }\n" +
                "        .back-button {\n" +
                "            padding: 10px 20px;\n" +
                "            background-color: #3498db;\n" +
                "            color: #fff;\n" +
                "            text-decoration: none;\n" +
                "            border-radius: 5px;\n" +
                "            font-weight: bold;\n" +
                "        }\n" +
                "        .back-button:hover {\n" +
                "            background-color: #2980b9;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <h1>Team Member: Ruslan</h1>\n" +
                "        <div class=\"info-block\">\n" +
                "            <label for=\"name\">Name Surname:</label>\n" +
                "            <div id=\"name\">Ruslan Zhadko</div>\n" +
                "        </div>\n" +
                "        <div class=\"info-block\">\n" +
                "            <label for=\"position\">Position:</label>\n" +
                "            <div id=\"position\">Fullstack Developer</div>\n" +
                "        </div>\n" +
                "        <div class=\"info-block\">\n" +
                "            <label for=\"description\">Description:</label>\n" +
                "            <div id=\"description\">Backend and frontend developer responsible for managing project and cooking with frontend. Proud $HMSTR holder</div>\n" +
                "        </div>\n" +
                "        <div class=\"button-container\">\n" +
                "            <a href=\"/team\" class=\"back-button\">Back to Team</a>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

    }

    @GetMapping("/Mykola")
    @ResponseBody
    public String Mykola() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Team Member - Mykola</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f4f4f4;\n" +
                "            margin: 0;\n" +
                "            padding: 20px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        h1 {\n" +
                "            color: #2c3e50;\n" +
                "        }\n" +
                "        .container {\n" +
                "            max-width: 600px;\n" +
                "            margin: 20px auto;\n" +
                "            background: #fff;\n" +
                "            padding: 20px;\n" +
                "            border-radius: 8px;\n" +
                "            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" +
                "            text-align: left;\n" +
                "        }\n" +
                "        label {\n" +
                "            display: block;\n" +
                "            margin: 10px 0 5px;\n" +
                "            font-weight: bold;\n" +
                "        }\n" +
                "        .info-block {\n" +
                "            margin-bottom: 15px;\n" +
                "            padding: 10px;\n" +
                "            border: 1px solid #ddd;\n" +
                "            border-radius: 5px;\n" +
                "            background: #f9f9f9;\n" +
                "        }\n" +
                "        .button-container {\n" +
                "            text-align: center;\n" +
                "            margin-top: 20px;\n" +
                "        }\n" +
                "        .back-button {\n" +
                "            padding: 10px 20px;\n" +
                "            background-color: #3498db;\n" +
                "            color: #fff;\n" +
                "            text-decoration: none;\n" +
                "            border-radius: 5px;\n" +
                "            font-weight: bold;\n" +
                "        }\n" +
                "        .back-button:hover {\n" +
                "            background-color: #2980b9;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <h1>Team Member: Ruslan</h1>\n" +
                "        <div class=\"info-block\">\n" +
                "            <label for=\"name\">Name Surname:</label>\n" +
                "            <div id=\"name\">Mykola Volokyta</div>\n" +
                "        </div>\n" +
                "        <div class=\"info-block\">\n" +
                "            <label for=\"position\">Position:</label>\n" +
                "            <div id=\"position\">CTO</div>\n" +
                "        </div>\n" +
                "        <div class=\"info-block\">\n" +
                "            <label for=\"description\">Description:</label>\n" +
                "            <div id=\"description\">CTO of Bebra Team. Main customer of McDonald\'s. Cryptoinvestor (ROI -100%)</div>\n" +
                "        </div>\n" +
                "        <div class=\"button-container\">\n" +
                "            <a href=\"/team\" class=\"back-button\">Back to Team</a>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

    }

}
