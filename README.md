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
TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION

0. You just DO WHAT THE FUCK YOU WANT TO.
```
