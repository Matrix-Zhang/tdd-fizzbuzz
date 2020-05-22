# TDD @FizzBuzz


## 开发环境
 - JDK1.8+
 
## 业务需求

你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上课。游戏的规则是：

- 让所有学生排成一队，然后按顺序报数。

- 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是第7的倍数，那么要说Whizz。

- 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。

### Tasking

- 当所报是 3 的倍数，report Fizz

- 当所报是 5 的倍数， report Buzz

- 当所报是 7 的倍数， report Whizz

- 当所报是 15， report FizzBuzz

- 当所报是 35， report BuzzWhizz

- 当所报是 105， report FizzBuzzWhizz

- 当不满足以上条件， report 数字本身