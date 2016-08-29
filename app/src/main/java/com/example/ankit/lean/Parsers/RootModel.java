import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String privacy;
	public String name;
	public int id;
	public String email;
	public String type;
	public String logo;
	public String description;
	public String start_time;
	public String topic;
	public String schedule_published_on;
	public String background_image;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String organizer_description;
	public String location_name;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String end_time;

	public RootModel(String organizer_name, String privacy, String name, int id, String email, String type, String logo, String description, String start_time, String topic, String schedule_published_on, String background_image, String timezone, Call_for_papersModel call_for_papers, String state, String organizer_description, String location_name, CreatorModel creator, ArrayList<Social_linksModel> social_links, String code_of_conduct, CopyrightModel copyright, VersionModel version, String end_time) {

		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.name = name;
		this.id = id;
		this.email = email;
		this.type = type;
		this.logo = logo;
		this.description = description;
		this.start_time = start_time;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._creator = creator;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._version = version;
		this.end_time = end_time;

	}

}