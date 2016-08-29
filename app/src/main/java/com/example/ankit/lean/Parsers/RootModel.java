import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String organizer_name;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String description;
	public String privacy;
	public String name;
	public int id;
	public String state;
	public String timezone;
	public CreatorModel _creator;
	public String start_time;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String location_name;
	public String schedule_published_on;
	public String logo;
	public String type;
	public VersionModel _version;

	public RootModel(String code_of_conduct, String organizer_name, String organizer_description, CopyrightModel copyright, String email, Call_for_papersModel call_for_papers, String end_time, String description, String privacy, String name, int id, String state, String timezone, CreatorModel creator, String start_time, String topic, ArrayList<Social_linksModel> social_links, String background_image, String location_name, String schedule_published_on, String logo, String type, VersionModel version) {

		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.description = description;
		this.privacy = privacy;
		this.name = name;
		this.id = id;
		this.state = state;
		this.timezone = timezone;
		this._creator = creator;
		this.start_time = start_time;
		this.topic = topic;
		this.social_links = social_links;
		this.background_image = background_image;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.type = type;
		this._version = version;

	}

}