import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String location_name;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String state;
	public String email;
	public String description;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_description;
	public String start_time;
	public String organizer_name;
	public String code_of_conduct;
	public String timezone;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String type;
	public String privacy;
	public String background_image;
	public String logo;
	public int id;

	public RootModel(CreatorModel creator, String location_name, String topic, Call_for_papersModel call_for_papers, String end_time, String state, String email, String description, CopyrightModel copyright, String schedule_published_on, String organizer_description, String start_time, String organizer_name, String code_of_conduct, String timezone, VersionModel version, ArrayList<Social_linksModel> social_links, String name, String type, String privacy, String background_image, String logo, int id) {

		this._creator = creator;
		this.location_name = location_name;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.state = state;
		this.email = email;
		this.description = description;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._version = version;
		this.social_links = social_links;
		this.name = name;
		this.type = type;
		this.privacy = privacy;
		this.background_image = background_image;
		this.logo = logo;
		this.id = id;

	}

}