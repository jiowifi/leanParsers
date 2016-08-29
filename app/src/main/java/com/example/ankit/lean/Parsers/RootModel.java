import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String state;
	public VersionModel _version;
	public String schedule_published_on;
	public String type;
	public String background_image;
	public String timezone;
	public String organizer_name;
	public String privacy;
	public String email;
	public String organizer_description;
	public String description;
	public String name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String logo;
	public String topic;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public int id;
	public String location_name;
	public CreatorModel _creator;

	public RootModel(Call_for_papersModel call_for_papers, String state, VersionModel version, String schedule_published_on, String type, String background_image, String timezone, String organizer_name, String privacy, String email, String organizer_description, String description, String name, String start_time, ArrayList<Social_linksModel> social_links, String end_time, String logo, String topic, CopyrightModel copyright, String code_of_conduct, int id, String location_name, CreatorModel creator) {

		this._call_for_papers = call_for_papers;
		this.state = state;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.email = email;
		this.organizer_description = organizer_description;
		this.description = description;
		this.name = name;
		this.start_time = start_time;
		this.social_links = social_links;
		this.end_time = end_time;
		this.logo = logo;
		this.topic = topic;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.location_name = location_name;
		this._creator = creator;

	}

}