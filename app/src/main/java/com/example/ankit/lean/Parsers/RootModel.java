import java.util.ArrayList;

class RootModel {

	public String timezone;
	public int id;
	public String schedule_published_on;
	public String name;
	public String privacy;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String email;
	public String logo;
	public String state;
	public CopyrightModel _copyright;
	public String location_name;
	public String end_time;
	public String start_time;
	public String code_of_conduct;
	public VersionModel _version;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String topic;
	public String organizer_name;
	public String organizer_description;

	public RootModel(String timezone, int id, String schedule_published_on, String name, String privacy, String description, ArrayList<Social_linksModel> social_links, String type, String email, String logo, String state, CopyrightModel copyright, String location_name, String end_time, String start_time, String code_of_conduct, VersionModel version, CreatorModel creator, Call_for_papersModel call_for_papers, String background_image, String topic, String organizer_name, String organizer_description) {

		this.timezone = timezone;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.privacy = privacy;
		this.description = description;
		this.social_links = social_links;
		this.type = type;
		this.email = email;
		this.logo = logo;
		this.state = state;
		this._copyright = copyright;
		this.location_name = location_name;
		this.end_time = end_time;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;

	}

}