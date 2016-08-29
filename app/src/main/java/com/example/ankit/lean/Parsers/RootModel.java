import java.util.ArrayList;

class RootModel {

	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String organizer_description;
	public String organizer_name;
	public String schedule_published_on;
	public String email;
	public String end_time;
	public String topic;
	public String location_name;
	public CreatorModel _creator;
	public String privacy;
	public String name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String description;
	public String background_image;
	public String type;
	public VersionModel _version;
	public String timezone;
	public String logo;

	public RootModel(int id, ArrayList<Social_linksModel> social_links, String state, String organizer_description, String organizer_name, String schedule_published_on, String email, String end_time, String topic, String location_name, CreatorModel creator, String privacy, String name, String start_time, Call_for_papersModel call_for_papers, String code_of_conduct, CopyrightModel copyright, String description, String background_image, String type, VersionModel version, String timezone, String logo) {

		this.id = id;
		this.social_links = social_links;
		this.state = state;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.end_time = end_time;
		this.topic = topic;
		this.location_name = location_name;
		this._creator = creator;
		this.privacy = privacy;
		this.name = name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.description = description;
		this.background_image = background_image;
		this.type = type;
		this._version = version;
		this.timezone = timezone;
		this.logo = logo;

	}

}