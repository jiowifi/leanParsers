import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String description;
	public String code_of_conduct;
	public String email;
	public String name;
	public String schedule_published_on;
	public String organizer_name;
	public int id;
	public String end_time;
	public String start_time;
	public String timezone;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String state;
	public CreatorModel _creator;
	public String topic;
	public VersionModel _version;
	public String type;
	public String organizer_description;

	public RootModel(String location_name, String logo, Call_for_papersModel call_for_papers, CopyrightModel copyright, String description, String code_of_conduct, String email, String name, String schedule_published_on, String organizer_name, int id, String end_time, String start_time, String timezone, String privacy, ArrayList<Social_linksModel> social_links, String background_image, String state, CreatorModel creator, String topic, VersionModel version, String type, String organizer_description) {

		this.location_name = location_name;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.id = id;
		this.end_time = end_time;
		this.start_time = start_time;
		this.timezone = timezone;
		this.privacy = privacy;
		this.social_links = social_links;
		this.background_image = background_image;
		this.state = state;
		this._creator = creator;
		this.topic = topic;
		this._version = version;
		this.type = type;
		this.organizer_description = organizer_description;

	}

}