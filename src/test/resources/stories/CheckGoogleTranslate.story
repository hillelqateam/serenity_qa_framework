Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Verify user is able to translate a custom world, using different languages

Given user is opened 'https://translate.google.com/' site
When user choose following language '<sourceLanguage>' as a source
When user fills in following registration info:
|user  |age|surname|mail            |
|User_1|21 |User_1_S|User_1@mail.ca |

And user choose following language '<targestLanguage>' as a target
And user types '<inputWorld>' into the source input

Then user should see next translated world '<translatedResult>'

Examples:
| sourceLanguage | targestLanguage | inputWorld | translatedResult |
| English        | Spanish         | Tests      | Pruebas          |
| Spanish        | English         | Pruebas    | Tests            |