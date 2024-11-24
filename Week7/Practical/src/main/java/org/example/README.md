# Threads

thread is the smallest unit in an executing program. Each thread performs a specific task

- Process - An executing program (MS word)
- Multi processing - 
  - Running multiple processes concurrently (MS word, chrome), 
  - Need memory for each process, heavy weighted(switching between process is costly)
- Multi threading - Running multiple tasks at the same time

## Multi threading

- One process divided into sub processes/ tasks called threads.
- Each thread shares the same memory of the process
- Time saving, multi tasking
- eg: Word has several threads running concurrently for UI, Grammar checking, auto saving

### Each Program/ process has at least one thread
-  Java also have one thread which is executing in ***main*** method (main Thread)