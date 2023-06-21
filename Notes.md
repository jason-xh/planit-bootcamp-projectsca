# Notes from the week

Send keys to text field:
`driver.findElement(By.id("email")).sendKeys("notavalidemail");`

```javascript
        /* CSS Selector notes:

        selectors by ID/classname/tagname are usually better

        #nav-contact // id
        .btn-contact // class
        div // tag <table />  <div />   <a />
        =div // also tag <div />
        > // DIRECT child
        [attribute='value'] // <input attribute='value'/>
        .navigation-desktop input.expand-visible // whitespace means to select from all children not just direct children
        table#nav-contact.btn-contact // linking with no spaces means it's selecting the SAME element
        // the line above is saying, select the table with class btn-contact and ID nav-contact
        // e.g. to select the below input field
<input class="expand-visible" name="q" size="20" type="text">
var element = driver.findElement(By.cssSelector("input.expand-visible")

        // jquery in console
        $(".btn-contact")
        $$(".btn-contact") // can tell you how many there are
        
        */
```
XPath selector notes
```javascript
       double slash to denote start of xpath //
       text //a[text()="Ask Question"]
       text //a[.="Ask Question"]
       tags //div[@id='footerlinks-2']
       contains //a[contains(@class,"lvl2link")][.="Life & Recover Cover"]
       ancestor //h4[.='" + extrasCover + "']/ancestor::div[contains(@class,"item slide")]//a[.='Select']
       h3[.="LIFE PROTECT INSURANCE"]/ancestor::div[contains(@class,"lt1_filter_slide ")]//span[.="Get a quote"]"
        String TEXT_ExtrasLimits_LimitValue = "//div[@class='info']//span[contains(@class,'heading')][.='%s']/ancestor::div[@class='info']/following-sibling::div[@class='progress-container']//p[not(contains(@class,'helper-txt'))]";

       [not(@disabled)]

```
TCK142A
WR7DCX+

# Things to talk about in presentation

* Inheritance vs composition. All pages had a nav bar except for the cart page. Inheritance was probably a better choice here but I wanted to try implement it with composition to give it a go. David mentioned I can use both composition and inheritance so I still included a base page for future maintenance in case we want to add things to it, but it's pretty redundant at the moment.
* No style guide given so I tried to follow my own style consistently.
* Didn't have too many issues with selectors. I used IDs when there were IDs, and then class names when there weren't.
* Run tests.
* Cart page list of items.
* Search button dilemma. Running out of time.
* Find elements not working well for final test.
* Git usage.
