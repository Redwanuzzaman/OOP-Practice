#include <bits/stdc++.h>
using namespace std;

class Student
{
private:
    int age, standard;
    string first_name, last_name;
public:
    void set_age(int a)
    {
        age = a;
    }
    void set_first_name(string fn)
    {
        first_name = fn;
    }
    void set_last_name(string ln)
    {
        last_name = ln;
    }
    void set_standard(int sd)
    {
        standard = sd;
    }
    int get_age()
    {
        return age;
    }
    string get_first_name()
    {
        return first_name;
    }
    string get_last_name()
    {
        return last_name;
    }
    int get_standard()
    {
        return standard;
    }
};

int main()
{
    Student st;
    int age, standard;
    string first_name, last_name;

    cin >> age >> first_name >> last_name >> standard;

    st.set_age(age);
    st.set_standard(standard);
    st.set_first_name(first_name);
    st.set_last_name(last_name);

    cout << st.get_age() << "\n";
    cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
    cout << st.get_standard() << "\n\n";
    cout << st.get_age() << "," << st.get_first_name() << "," << st.get_last_name() << "," << st.get_standard() << endl;
}
