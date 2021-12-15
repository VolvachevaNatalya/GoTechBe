-- questionaries
INSERT INTO questionnaire (id) VALUES (1);
INSERT INTO questionnaire (id) VALUES (2);

-- questions
INSERT INTO question (id, control_type, key, label, "order", required, questionnaire_id)
VALUES (1, 'text_box', 'preferences', 'What do you like about programming?', 2, true, 1);

INSERT INTO question (id, control_type, key, label, "order", required, questionnaire_id)
VALUES (2, 'radio', 'assignment', 'How was the assignment?', 3, true, 1);

INSERT INTO question(id, control_type, key, label, "order", required, questionnaire_id)
VALUES (3, 'dropdown', 'brave', 'Bravery Rating', 4, true, 1 );

INSERT INTO question (id, control_type, key, label, "order", required, questionnaire_id)
VALUES (4, 'radio', 'language', 'What language is your favorite?', 4, true, 1);


INSERT INTO radiobutton_question (id)
VALUES (2);

INSERT INTO dropdown_question (id)
VALUES  (3);

INSERT INTO option(id, key, value)
VALUES (1, 'Easy', 'easy'),
       (2, 'Normal', 'normal'),
       (3, 'Hard', 'hard'),
       (4, 'Solid', 'solid'),
       (5, 'Great', 'great'),
       (6, 'Good', 'good'),
       (7, 'Unproven', 'unproven'),
       (8, 'JavaScript', 'js'),
       (9, 'TypeScript', 'ts'),
       (10, 'CoffeeScript', 'cs');

INSERT INTO radiobutton_question (id, free_text)
VALUES (4, 'Other');

INSERT INTO radiobutton_question_options (radio_buttons_question_id, options_id)
VALUES (2, 1),
       (2, 2),
       (2, 3),
       (4, 8),
       (4, 9),
       (4, 10);

INSERT INTO dropdown_question_options (dropdown_question_id, options_id)
VALUES (3,4),
       (3,5),
       (3,6),
       (3,7);
