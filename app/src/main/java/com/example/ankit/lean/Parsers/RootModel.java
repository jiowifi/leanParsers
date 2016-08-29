import java.util.ArrayList;

class RootModel {

	public int id;
	public String state;
	public String code_of_conduct;
	public String schedule_published_on;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String location_name;
	public String description;
	public CopyrightModel _copyright;
	public String timezone;
	public VersionModel _version;
	public String background_image;
	public String name;
	public String organizer_description;
	public String start_time;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String end_time;
	public String logo;
	public String topic;
	public String organizer_name;

	public RootModel(int id, String state, String code_of_conduct, String schedule_published_on, CreatorModel creator, ArrayList<Social_linksModel> social_links, String email, String location_name, String description, CopyrightModel copyright, String timezone, VersionModel version, String background_image, String name, String organizer_description, String start_time, String privacy, Call_for_papersModel call_for_papers, String type, String end_time, String logo, String topic, String organizer_name) {

		this.id = id;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.social_links = social_links;
		this.email = email;
		this.location_name = location_name;
		this.description = description;
		this._copyright = copyright;
		this.timezone = timezone;
		this._version = version;
		this.background_image = background_image;
		this.name = name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.end_time = end_time;
		this.logo = logo;
		this.topic = topic;
		this.organizer_name = organizer_name;

	}

}