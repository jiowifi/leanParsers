import java.util.ArrayList;

class RootModel {

	public String email;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String topic;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String organizer_description;
	public String code_of_conduct;
	public String logo;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String timezone;
	public int id;
	public String background_image;
	public String name;
	public String state;
	public String privacy;
	public String description;
	public String schedule_published_on;
	public String type;

	public RootModel(String email, String end_time, ArrayList<Social_linksModel> social_links, String location_name, String topic, CreatorModel creator, CopyrightModel copyright, VersionModel version, String organizer_description, String code_of_conduct, String logo, String start_time, Call_for_papersModel call_for_papers, String organizer_name, String timezone, int id, String background_image, String name, String state, String privacy, String description, String schedule_published_on, String type) {

		this.email = email;
		this.end_time = end_time;
		this.social_links = social_links;
		this.location_name = location_name;
		this.topic = topic;
		this._creator = creator;
		this._copyright = copyright;
		this._version = version;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.id = id;
		this.background_image = background_image;
		this.name = name;
		this.state = state;
		this.privacy = privacy;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;

	}

}