import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String description;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String start_time;
	public String timezone;
	public String location_name;
	public String type;
	public String logo;
	public String topic;
	public int id;
	public String end_time;
	public String schedule_published_on;
	public VersionModel _version;
	public String name;
	public String organizer_name;
	public String organizer_description;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String email;

	public RootModel(String privacy, String code_of_conduct, CreatorModel creator, String description, String background_image, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String start_time, String timezone, String location_name, String type, String logo, String topic, int id, String end_time, String schedule_published_on, VersionModel version, String name, String organizer_name, String organizer_description, String state, Call_for_papersModel call_for_papers, String email) {

		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.description = description;
		this.background_image = background_image;
		this.social_links = social_links;
		this._copyright = copyright;
		this.start_time = start_time;
		this.timezone = timezone;
		this.location_name = location_name;
		this.type = type;
		this.logo = logo;
		this.topic = topic;
		this.id = id;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.name = name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.email = email;

	}

}