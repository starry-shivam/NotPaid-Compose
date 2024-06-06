## Client did not pay?


Add opacity to the app contents and decrease it every day until their app completely fades away. Set a due date and customize the number of days you offer them until the app's UI is fully vanished. 


```kotlin
EnsurePayment(
    dueDate = "2024-08-24", // Due date for payment
    gracePeriod = 14 // Grace period in days
) {
    // App contents..
    NavGraph(...)
}

```
## Author
- Inspired from [kleampa/not-paid](https://github.com/kleampa/not-paid)
- Made by [Shivam](https://github.com/starry-shivam)

## License
```
DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
Version 2, December 2004

Copyright (C) 2024 Stɑrry Shivɑm <starry@krsh.dev>

Everyone is permitted to copy and distribute verbatim or modified
copies of this license document, and changing it is allowed as long
as the name is changed.

DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION

0. You just DO WHAT THE FUCK YOU WANT TO.
```
