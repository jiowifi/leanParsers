import java.util.ArrayList;

class RootModel {

	public String privacy;
	public int id;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String organizer_description;
	public String organizer_name;
	public String background_image;
	public String logo;
	public String start_time;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String email;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String timezone;
	public String description;
	public String location_name;
	public CopyrightModel _copyright;
	public String state;
	public String type;

	public RootModel(String privacy, int id, String topic, Call_for_papersModel call_for_papers, String name, String organizer_description, String organizer_name, String background_image, String logo, String start_time, String code_of_conduct, CreatorModel creator, String schedule_published_on, String email, VersionModel version, ArrayList<Social_linksModel> social_links, String end_time, String timezone, String description, String location_name, CopyrightModel copyright, String state, String type) {

		this.privacy = privacy;
		this.id = id;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.logo = logo;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._version = version;
		this.social_links = social_links;
		this.end_time = end_time;
		this.timezone = timezone;
		this.description = description;
		this.location_name = location_name;
		this._copyright = copyright;
		this.state = state;
		this.type = type;

	}

}