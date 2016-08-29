import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String state;
	public String start_time;
	public String topic;
	public String organizer_description;
	public String name;
	public CopyrightModel _copyright;
	public String description;
	public String email;
	public String timezone;
	public String schedule_published_on;
	public String background_image;
	public String type;
	public String location_name;
	public String end_time;
	public CreatorModel _creator;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public int id;

	public RootModel(String code_of_conduct, String logo, ArrayList<Social_linksModel> social_links, String organizer_name, String state, String start_time, String topic, String organizer_description, String name, CopyrightModel copyright, String description, String email, String timezone, String schedule_published_on, String background_image, String type, String location_name, String end_time, CreatorModel creator, VersionModel version, Call_for_papersModel call_for_papers, String privacy, int id) {

		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.state = state;
		this.start_time = start_time;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.name = name;
		this._copyright = copyright;
		this.description = description;
		this.email = email;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.type = type;
		this.location_name = location_name;
		this.end_time = end_time;
		this._creator = creator;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.id = id;

	}

}