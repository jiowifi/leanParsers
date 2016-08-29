import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public VersionModel _version;
	public String email;
	public String schedule_published_on;
	public String description;
	public String code_of_conduct;
	public String background_image;
	public String start_time;
	public String timezone;
	public String state;
	public String privacy;
	public String topic;
	public String location_name;
	public CopyrightModel _copyright;
	public int id;
	public CreatorModel _creator;
	public String organizer_name;
	public String name;
	public String type;
	public String organizer_description;

	public RootModel(ArrayList<Social_linksModel> social_links, String end_time, Call_for_papersModel call_for_papers, String logo, VersionModel version, String email, String schedule_published_on, String description, String code_of_conduct, String background_image, String start_time, String timezone, String state, String privacy, String topic, String location_name, CopyrightModel copyright, int id, CreatorModel creator, String organizer_name, String name, String type, String organizer_description) {

		this.social_links = social_links;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this._version = version;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.start_time = start_time;
		this.timezone = timezone;
		this.state = state;
		this.privacy = privacy;
		this.topic = topic;
		this.location_name = location_name;
		this._copyright = copyright;
		this.id = id;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.name = name;
		this.type = type;
		this.organizer_description = organizer_description;

	}

}