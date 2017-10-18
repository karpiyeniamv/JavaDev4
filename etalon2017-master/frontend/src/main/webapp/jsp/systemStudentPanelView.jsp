<%--
  Created by IntelliJ IDEA.
  User: KarpiyeniaM
  Date: 16.10.2017
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>System student panel</title>
    <style>
        .tablesorter-pager .btn-group-sm .btn {
            font-size: 1.2em;
        }
    </style>
    <script id="js">$(function() {

        $("table").tablesorter({
            theme : "bootstrap",

            widthFixed: true,

            // widget code contained in the jquery.tablesorter.widgets.js file
            // use the zebra stripe widget if you plan on hiding any rows (filter widget)
            // the uitheme widget is NOT REQUIRED!
            widgets : [ "filter", "columns", "zebra" ],

            widgetOptions : {
                // using the default zebra striping class name, so it actually isn't included in the theme variable above
                // this is ONLY needed for bootstrap theming if you are using the filter widget, because rows are hidden
                zebra : ["even", "odd"],

                // class names added to columns when sorted
                columns: [ "primary", "secondary", "tertiary" ],

                // reset filters button
                filter_reset : ".reset",

                // extra css class name (string or array) added to the filter element (input or select)
                filter_cssFilter: [
                    'form-control',
                    'form-control',
                    'form-control custom-select', // select needs custom class names :(
                    'form-control',
                    'form-control',
                    'form-control',
                    'form-control'
                ]

            }
        })
            .tablesorterPager({

                // target the pager markup - see the HTML block below
                container: $(".ts-pager"),

                // target the pager page select dropdown - choose a page
                cssGoto  : ".pagenum",

                // remove rows from the table to speed up the sort of large tables.
                // setting this to false, only hides the non-visible rows; needed if you plan to add/remove rows with the pager enabled.
                removeRows: false,

                // output string - default is '{page}/{totalPages}';
                // possible variables: {page}, {totalPages}, {filteredPages}, {startRow}, {endRow}, {filteredRows} and {totalRows}
                output: '{startRow} - {endRow} / {filteredRows} ({totalRows})'

            });

    });</script>

    <script>
        $(function(){

            // filter button demo code
            $('button.filter').click(function(){
                var col = $(this).data('column'),
                    txt = $(this).data('filter');
                $('table').find('.tablesorter-filter').val('').eq(col).val(txt);
                $('table').trigger('search', false);
                return false;
            });

            // toggle zebra widget
            $('button.zebra').click(function(){
                var t = $(this).hasClass('btn-success');
                $('table')
                    .toggleClass('table-striped')[0]
                    .config.widgets = (t) ? ["filter"] : ["filter", "zebra"];
                $(this)
                    .toggleClass('btn-danger btn-success')
                    .find('span')
                    .text(t ? 'disabled' : 'enabled');
                $('table').trigger('refreshWidgets', [false]);
                return false;
            });
        });
    </script>
</head>
<body>
<jsp:include page="/jsp/blocks/header.jsp"/>

<div class="container">
    <jsp:include page="/jsp/blocks/title.jsp">
        <jsp:param name="heading" value="Welcome on System student panel"/>
    </jsp:include>
</div>
<br>
<br>

<div align="center">
    <button type="button" class="btn btn-primary" onclick="window.location='requestsView.jsp'">Show all requests
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#addRequestModal">Add request
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createStudentModal">Create student
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#assignStudentsModal">Assign
        students
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createSpecialtyModal">Create
        specialty
    </button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#createFacultyModal">Create faculty
    </button>
</div>

<jsp:include page="/jsp/addRequestModal.jsp"/>
<jsp:include page="/jsp/createStudentModal.jsp"/>
<jsp:include page="/jsp/assignStudentsModal.jsp"/>
<jsp:include page="/jsp/createSpecialtyModal.jsp"/>
<jsp:include page="/jsp/createFacultyModal.jsp"/>


<br><br>



<div id="main">



    <h1>Demo</h1>


    <div id="demo"><table class="table table-bordered table-striped">
        <thead> <!-- add class="thead-inverse" for a dark header -->
        <tr>
            <th>Name</th>
            <th>Major</th>
            <th class="filter-select filter-exact" data-placeholder="Pick a gender">Sex</th>
            <th>English</th>
            <th>Japanese</th>
            <th>Calculus</th>
            <th class="sorter-false filter-false">Geometry</th></tr>
        </thead>
        <tfoot>
        <tr>
            <th>Name</th>
            <th>Major</th>
            <th>Sex</th>
            <th>English</th>
            <th>Japanese</th>
            <th>Calculus</th>
            <th>Geometry</th>
        </tr>
        <tr>
            <th colspan="7" class="ts-pager">
                <div class="form-inline">
                    <div class="btn-group btn-group-sm mx-1" role="group">
                        <button type="button" class="btn btn-secondary first" title="first">&#8676;</button>
                        <button type="button" class="btn btn-secondary prev" title="previous">&larr;</button>
                    </div>
                    <span class="pagedisplay"></span>
                    <div class="btn-group btn-group-sm mx-1" role="group">
                        <button type="button" class="btn btn-secondary next" title="next">&rarr;</button>
                        <button type="button" class="btn btn-secondary last" title="last">&#8677;</button>
                    </div>
                    <select class="form-control-sm custom-select px-1 pagesize" title="Select page size">
                        <option selected="selected" value="10">10</option>
                        <option value="20">20</option>
                        <option value="30">30</option>
                        <option value="all">All Rows</option>
                    </select>
                    <select class="form-control-sm custom-select px-4 mx-1 pagenum" title="Select page number"></select>
                </div>
            </th>
        </tr>
        </tfoot>
        <tbody>
        <tr><td>Student01</td><td>Languages</td><td>male</td><td>80</td><td>70</td><td>75</td><td>80</td></tr>
        <tr><td>Student02</td><td>Mathematics</td><td>male</td><td>90</td><td>88</td><td>100</td><td>90</td></tr>
        <tr><td>Student03</td><td>Languages</td><td>female</td><td>85</td><td>95</td><td>80</td><td>85</td></tr>
        <tr><td>Student04</td><td>Languages</td><td>male</td><td>60</td><td>55</td><td>100</td><td>100</td></tr>
        <tr><td>Student05</td><td>Languages</td><td>female</td><td>68</td><td>80</td><td>95</td><td>80</td></tr>
        <tr><td>Student06</td><td>Mathematics</td><td>male</td><td>100</td><td>99</td><td>100</td><td>90</td></tr>
        <tr><td>Student07</td><td>Mathematics</td><td>male</td><td>85</td><td>68</td><td>90</td><td>90</td></tr>
        <tr><td>Student08</td><td>Languages</td><td>male</td><td>100</td><td>90</td><td>90</td><td>85</td></tr>
        <tr><td>Student09</td><td>Mathematics</td><td>male</td><td>80</td><td>50</td><td>65</td><td>75</td></tr>
        <tr><td>Student10</td><td>Languages</td><td>male</td><td>85</td><td>100</td><td>100</td><td>90</td></tr>
        <tr><td>Student11</td><td>Languages</td><td>male</td><td>86</td><td>85</td><td>100</td><td>100</td></tr>
        <tr><td>Student12</td><td>Mathematics</td><td>female</td><td>100</td><td>75</td><td>70</td><td>85</td></tr>
        <tr><td>Student13</td><td>Languages</td><td>female</td><td>100</td><td>80</td><td>100</td><td>90</td></tr>
        <tr><td>Student14</td><td>Languages</td><td>female</td><td>50</td><td>45</td><td>55</td><td>90</td></tr>
        <tr><td>Student15</td><td>Languages</td><td>male</td><td>95</td><td>35</td><td>100</td><td>90</td></tr>
        <tr><td>Student16</td><td>Languages</td><td>female</td><td>100</td><td>50</td><td>30</td><td>70</td></tr>
        <tr><td>Student17</td><td>Languages</td><td>female</td><td>80</td><td>100</td><td>55</td><td>65</td></tr>
        <tr><td>Student18</td><td>Mathematics</td><td>male</td><td>30</td><td>49</td><td>55</td><td>75</td></tr>
        <tr><td>Student19</td><td>Languages</td><td>male</td><td>68</td><td>90</td><td>88</td><td>70</td></tr>
        <tr><td>Student20</td><td>Mathematics</td><td>male</td><td>40</td><td>45</td><td>40</td><td>80</td></tr>
        <tr><td>Student21</td><td>Languages</td><td>male</td><td>50</td><td>45</td><td>100</td><td>100</td></tr>
        <tr><td>Student22</td><td>Mathematics</td><td>male</td><td>100</td><td>99</td><td>100</td><td>90</td></tr>
        <tr><td>Student23</td><td>Mathematics</td><td>male</td><td>82</td><td>77</td><td>0</td><td>79</td></tr>
        <tr><td>Student24</td><td>Languages</td><td>female</td><td>100</td><td>91</td><td>13</td><td>82</td></tr>
        <tr><td>Student25</td><td>Mathematics</td><td>male</td><td>22</td><td>96</td><td>82</td><td>53</td></tr>
        <tr><td>Student26</td><td>Languages</td><td>female</td><td>37</td><td>29</td><td>56</td><td>59</td></tr>
        <tr><td>Student27</td><td>Mathematics</td><td>male</td><td>86</td><td>82</td><td>69</td><td>23</td></tr>
        <tr><td>Student28</td><td>Languages</td><td>female</td><td>44</td><td>25</td><td>43</td><td>1</td></tr>
        <tr><td>Student29</td><td>Mathematics</td><td>male</td><td>77</td><td>47</td><td>22</td><td>38</td></tr>
        <tr><td>Student30</td><td>Languages</td><td>female</td><td>19</td><td>35</td><td>23</td><td>10</td></tr>
        <tr><td>Student31</td><td>Mathematics</td><td>male</td><td>90</td><td>27</td><td>17</td><td>50</td></tr>
        <tr><td>Student32</td><td>Languages</td><td>female</td><td>60</td><td>75</td><td>33</td><td>38</td></tr>
        <tr><td>Student33</td><td>Mathematics</td><td>male</td><td>4</td><td>31</td><td>37</td><td>15</td></tr>
        <tr><td>Student34</td><td>Languages</td><td>female</td><td>77</td><td>97</td><td>81</td><td>44</td></tr>
        <tr><td>Student35</td><td>Mathematics</td><td>male</td><td>5</td><td>81</td><td>51</td><td>95</td></tr>
        <tr><td>Student36</td><td>Languages</td><td>female</td><td>70</td><td>61</td><td>70</td><td>94</td></tr>
        <tr><td>Student37</td><td>Mathematics</td><td>male</td><td>60</td><td>3</td><td>61</td><td>84</td></tr>
        <tr><td>Student38</td><td>Languages</td><td>female</td><td>63</td><td>39</td><td>0</td><td>11</td></tr>
        <tr><td>Student39</td><td>Mathematics</td><td>male</td><td>50</td><td>46</td><td>32</td><td>38</td></tr>
        <tr><td>Student40</td><td>Languages</td><td>female</td><td>51</td><td>75</td><td>25</td><td>3</td></tr>
        <tr><td>Student41</td><td>Mathematics</td><td>male</td><td>43</td><td>34</td><td>28</td><td>78</td></tr>
        <tr><td>Student42</td><td>Languages</td><td>female</td><td>11</td><td>89</td><td>60</td><td>95</td></tr>
        <tr><td>Student43</td><td>Mathematics</td><td>male</td><td>48</td><td>92</td><td>18</td><td>88</td></tr>
        <tr><td>Student44</td><td>Languages</td><td>female</td><td>82</td><td>2</td><td>59</td><td>73</td></tr>
        <tr><td>Student45</td><td>Mathematics</td><td>male</td><td>91</td><td>73</td><td>37</td><td>39</td></tr>
        <tr><td>Student46</td><td>Languages</td><td>female</td><td>4</td><td>8</td><td>12</td><td>10</td></tr>
        <tr><td>Student47</td><td>Mathematics</td><td>male</td><td>89</td><td>10</td><td>6</td><td>11</td></tr>
        <tr><td>Student48</td><td>Languages</td><td>female</td><td>90</td><td>32</td><td>21</td><td>18</td></tr>
        <tr><td>Student49</td><td>Mathematics</td><td>male</td><td>42</td><td>49</td><td>49</td><td>72</td></tr>
        <tr><td>Student50</td><td>Languages</td><td>female</td><td>56</td><td>37</td><td>67</td><td>54</td></tr>
        </tbody>
    </table></div>




</div>



<table id="table-lizing-traktor" class="display" width="100%" cellspacing="0">

    <script>
        systemStudentPanelView()
    </script>
</table>



<div align="center">
    <button type="button" class="btn btn-primary">Delete</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#assignStudentsModal">Assign</button>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-primary">Release</button>
</div>

</body>
</html>
