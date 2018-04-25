(function($){
    var Controller = function(options){
        var $o = $.extend(true,{},Controller.DEFAULT,options);
        // this.$table = $($o.tableSelector).bootstrapTable({cache:$o.cache,responseHandler:$o.responseHandler,dataField:$o.dataField,url: $o.url,pagination:$o.pagination,sidePagination:$o.sidePagination,queryParamsType:$o.queryParamsType});
        this.$table = $($o.tableSelector).bootstrapTable($o);
        this.$modal = $($o.modalSelector).modal({show: $o.modalShow});
        this.$alert = $($o.alertSelector).hide();
        this.init($o);
    };
    Controller.DEFAULT = {
        sidePagination:"server",
        queryParamsType: "",
        responseHandler:"responseHandler",
        pagination:true,
        modalShow:false,
        cache: false,
        dataField: "records",
        url:"",
        type: "get",
        tableSelector:"#table",
        modalSelector:"#modal",
        alertSelector:".alert",
        createSelector:".create",
        contentType:"application/json",
        searchButtonSelector:"#searchButton"
    }

    Controller.prototype.init = function($o){

        var self = this;
        $(function () {
            // create event
            $($o.createSelector).click(function () {
                showModal(self.$modal,$(this).text());
            });

            $($o.searchButtonSelector).click(function(){
                self.$table.bootstrapTable('refresh');
            });

            self.$modal.find('.submit').click(function () {
                var valid = $("#formSubmit").valid();
                if(valid){
                    var envC = this;
                    var row = $('#formSubmit').serializeObject();
                    self.$modal.data('id')?null:row.isDel=0;
                    $.ajax({
                        url: $o.url + (self.$modal.data('id') || ''),
                        type: self.$modal.data('id') ? 'put' : 'post',
                        contentType: 'application/json',
                        data: JSON.stringify(row),
                        success: function () {
                            self.$modal.modal('hide');
                            self.$table.bootstrapTable('refresh');
                            showAlert(self.$alert,(self.$modal.data('id') ? 'Update' : 'Create') + ' item successful!', 'success');
                        },
                        error: function () {
                            self.$modal.modal('hide');
                            showAlert(self.$alert,(self.$modal.data('id') ? 'Update' : 'Create') + ' item error!', 'danger');
                        }
                    });
                }
            });
        });
        window.actionEvents = {
            'click .update': function (e, value, row) {
                showModal(self.$modal,$(this).attr('title'), row);
            },'click .editBut': function (e, value, row) {
                window._Parameter = row;
                window.location.hash = "#"+$(this).data("href");
            },
            'click .remove': function (e, value, row) {
                if (confirm('Are you sure to delete this item?')) {
                    $.ajax({
                        url: $o.url + row.id,
                        type: 'delete',
                        success: function () {
                            self.$table.bootstrapTable('refresh');
                            showAlert(self.$alert,'Delete item successful!', 'success');
                        },
                        error: function () {
                            showAlert(self.$alert,'Delete item error!', 'danger');
                        }
                    })
                }
            }
        };
    }



    // update and delete events

    function showModal($modal,title, row) {
        $("#formSubmit")[0].reset();
        row = row || {
                id: '',
                name: '',
                stargazers_count: 0,
                forks_count: 0,
                description: ''
            }; // default row value

        $modal.data('id', row.id);
        $modal.find('.modal-title').text(title);
        for (var name in row) {
            $modal.find('[name="' + name + '"]').val(row[name]);
        }
        $('select').trigger('change');
        $("#formSubmit").valid();
        $modal.modal('show');
    }

    function showAlert($alert,title, type) {
        $alert.attr('class', 'alert alert-' + type || 'success')
            .html('<i class="glyphicon glyphicon-check"></i> ' + title).show();
        setTimeout(function () {
            $alert.hide();
        }, 3000);
    }
    $.extend({initController:function(options){
        return new Controller(options);
    }});

    window.actionFormatter = function(value) {
        return [
            '<a class="update" href="javascript:" title="修改"><i class="glyphicon glyphicon-edit"></i></a>',
            '<a class="remove" href="javascript:" title="Delete Item"><i class="glyphicon glyphicon-remove-circle"></i></a>',
        ].join('');
    }
    window.responseHandler = function(data){
        return data.data;
    }
})(jQuery);