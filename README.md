# Adagio - GUI & GAME Framework for JAVA

# Examples

# Frame

## .create
```java
int width = 500;
int height = 600;
String title = "My frame with adagio";

Frame frame = new Frame();
frame.create(width, height, title);
```

![image](https://user-images.githubusercontent.com/47892486/125782348-f3d50aa0-e874-406e-ab7b-fc29896318fb.png)


## .setIcon
```java
URL url = "https://avatars.githubusercontent.com/u/47892486"
frame.setIcon(url);
```

![image](https://user-images.githubusercontent.com/47892486/125823028-27ccaebc-e189-4127-867c-2f600c1b716f.png)
![image](https://user-images.githubusercontent.com/47892486/125823047-a1901cd2-a854-44a2-a500-16848f2399bc.png)


## .delete
```java
frame.delete();
```

# Panel

## .setTitle
```java
Panel panel = new Panel();
panel.setTitle("My panel");
```

![image](https://user-images.githubusercontent.com/47892486/125824481-7edb2494-1adf-43ac-b49a-1b9a20722fd5.png)

## .getTitle

```java
Panel panel = new Panel();
panel.getTitle();
```
