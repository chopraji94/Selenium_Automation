using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenQA.Selenium;
using OpenQA.Selenium.Firefox;
using System.Threading;
using System.Collections.ObjectModel;

namespace TestCheck
{
    class Program
    {
        static void Main(string[] args)
        {
            IWebDriver driver = new FirefoxDriver();
            driver.Navigate().GoToUrl("https://www.hdfc.com/");
            driver.Manage().Window.Maximize();
          //  Thread.Sleep(2000);
            String ParentWindow = driver.CurrentWindowHandle;
            System.Diagnostics.Debug.WriteLine("The title of the parent Page is -: " + driver.Title);

            driver.FindElement(By.XPath("//*[@id=\"navbarDropdown\"]")).Click();

            Thread.Sleep(2000);

            driver.FindElement(By.LinkText("For Home Loans")).Click();

            Thread.Sleep(2000);

            driver.FindElement(By.LinkText("Customer Login")).Click();

            Thread.Sleep(5000);

            ReadOnlyCollection<string> windowHandles = driver.WindowHandles;

           // List<String> windowHandles = driver.WindowHandles.ToList();

            System.Diagnostics.Debug.WriteLine("The number of pages is -: " + windowHandles.Count);

           /* foreach(string handle in windowHandles)
            {
                if (handle != ParentWindow)
                {
                    driver.SwitchTo().Window(handle);
                    System.Diagnostics.Debug.WriteLine("Driver Current Title is -: " + driver.Title);
                    Thread.Sleep(2000);
                    driver.FindElement(By.LinkText("User ID")).Click();
                    Thread.Sleep(1000);
                    driver.FindElement(By.CssSelector("#loginForm > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")).SendKeys("chopraji94");
                    Thread.Sleep(1000);
                    driver.FindElement(By.CssSelector("#password")).SendKeys("password");

                    Thread.Sleep(1000);

                    driver.Quit();

                    break;
                }
            }*/

            foreach(string handle in windowHandles) {
                //System.Diagnostics.Debug.WriteLine("Driver Current Title is -: " + handle);
                 if ( handle != ParentWindow )
                 {
                     driver.SwitchTo().Window(handle);
                     System.Diagnostics.Debug.WriteLine("Driver Current Title is -: " + driver.Title);
                    Thread.Sleep(2000);
                    driver.FindElement(By.LinkText("User ID")).Click();
                    Thread.Sleep(1000);
                    driver.FindElement(By.CssSelector("#loginForm > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")).SendKeys("chopraji94");
                    Thread.Sleep(1000);
                    driver.FindElement(By.CssSelector("#password")).SendKeys("password");

                    Thread.Sleep(1000);

                    driver.Quit();

                    break;
                 }
            }
        }
    }
}
