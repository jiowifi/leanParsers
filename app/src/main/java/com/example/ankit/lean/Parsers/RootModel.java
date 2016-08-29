import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String location_name;
	public CreatorModel _creator;
	public VersionModel _version;
	public String name;
	public String organizer_description;
	public String organizer_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String topic;
	public String start_time;
	public String state;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String background_image;
	public String timezone;
	public String end_time;
	public String email;
	public String type;
	public String logo;

	public RootModel(String code_of_conduct, CopyrightModel copyright, String location_name, CreatorModel creator, VersionModel version, String name, String organizer_description, String organizer_name, int id, ArrayList<Social_linksModel> social_links, String description, String topic, String start_time, String state, String schedule_published_on, Call_for_papersModel call_for_papers, String privacy, String background_image, String timezone, String end_time, String email, String type, String logo) {

		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.location_name = location_name;
		this._creator = creator;
		this._version = version;
		this.name = name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.id = id;
		this.social_links = social_links;
		this.description = description;
		this.topic = topic;
		this.start_time = start_time;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.background_image = background_image;
		this.timezone = timezone;
		this.end_time = end_time;
		this.email = email;
		this.type = type;
		this.logo = logo;

	}

}