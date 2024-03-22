package interfaceLearning;

/**
 * @author Chin
 * @description
 * @date 2023/10/17 7:07 下午
 **/
public class teacher implements Person{

    @Override
    public void teach() {
        System.out.println("老师在教书");
    }

    @Override
    public void study() {
        System.out.println("老师在学习");
    }
}
