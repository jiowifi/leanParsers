import java.util.ArrayList;

class RootModel {

	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String location_name;
	public String description;
	public String end_time;
	public String email;
	public String privacy;
	public String organizer_description;
	public CreatorModel _creator;
	public VersionModel _version;
	public String type;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String code_of_conduct;
	public String name;
	public String start_time;
	public String topic;
	public String background_image;
	public String timezone;

	public RootModel(int id, ArrayList<Social_linksModel> social_links, String organizer_name, String logo, Call_for_papersModel call_for_papers, String state, String location_name, String description, String end_time, String email, String privacy, String organizer_description, CreatorModel creator, VersionModel version, String type, CopyrightModel copyright, String schedule_published_on, String code_of_conduct, String name, String start_time, String topic, String background_image, String timezone) {

		this.id = id;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.location_name = location_name;
		this.description = description;
		this.end_time = end_time;
		this.email = email;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._version = version;
		this.type = type;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.start_time = start_time;
		this.topic = topic;
		this.background_image = background_image;
		this.timezone = timezone;

	}

}